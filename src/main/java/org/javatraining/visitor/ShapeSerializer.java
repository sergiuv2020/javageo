package org.javatraining.visitor;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.javatraining.exceptions.CannotFormShape;
import org.javatraining.shapes.AbstractPolygon;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sergiu Vidrascu on 5/24/15.
 */
public class ShapeSerializer {

    public byte[] generateJsonforShapes(List<AbstractPolygon> shapelist) throws IOException, CannotFormShape {
        ByteArrayOutputStream bytestream = new ByteArrayOutputStream();
        JsonGenerator jsonGenerator = new JsonFactory()
                .createGenerator(bytestream);
        //for pretty printing
        jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
        jsonGenerator.setCodec(new ObjectMapper());

//        jsonGenerator.writeTree(shapelist); // start root object

        for (AbstractPolygon abstractPolygon : shapelist) {
            jsonGenerator.writeObject(abstractPolygon);
        }
//        jsonGenerator.writeEndObject(); //closing root object

        jsonGenerator.flush();
        jsonGenerator.close();

        return bytestream.toByteArray();
    }

    public List<AbstractPolygon> jsonDeserializer(File file) throws IOException, CannotFormShape {
        ObjectMapper mapper = new ObjectMapper();
        List<AbstractPolygon> shapelist =
                mapper.readValue(file,
                        new TypeReference<List<AbstractPolygon>>() {});
        System.out.println(mapper.writeValueAsString(shapelist));
        return shapelist;
    }
}

