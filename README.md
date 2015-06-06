# javageo [![Build Status on Travis CI](https://travis-ci.org/svidrascu/javageo.svg?branch=laborator4)](https://travis-ci.org/svidrascu/javageo)

1. You can now upload a json file with this collection format at localhost:8080/upload

[{
  "@shape" : "Hexagon",
  "side" : 3.0
},
{
  "@shape" : "TriangleEquilateral",
  "side" : 3.0
},
{
  "@shape" : "Square",
  "side" : 3.0
},
{
  "@shape" : "Pentagon",
  "side" : 3.0
}]

and you will get back as a response a json with your objects
along with the perimeter and area calculated:

{
  "@shape" : "Hexagon",
  "side" : [ 3.0, 3.0, 3.0, 3.0, 3.0, 3.0 ],
  "perimeter" : 18.0,
  "area" : 666.0
} {
  "@shape" : "TriangleEquilateral",
  "side" : [ 3.0, 3.0, 3.0 ],
  "perimeter" : 9.0,
  "area" : 3.8971143170299736
} {
  "@shape" : "Square",
  "side" : [ 3.0, 3.0, 3.0, 3.0 ],
  "perimeter" : 12.0,
  "area" : 9.0
} {
  "@shape" : "Pentagon",
  "side" : [ 3.0, 3.0, 3.0, 3.0, 3.0 ],
  "perimeter" : 15.0,
  "area" : 555.0
}

## Laboratorul 4 - > Diagrama de clase
![Diagrama de Clase](https://raw.githubusercontent.com/svidrascu/javageo/laborator4/diagram.png)

