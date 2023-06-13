package com.example.springdeploy.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
public class HolaController {

    //Creacion de variable
    @Value("${app.message}") //INYECTO MI PROPIEDAD ESCRITA EN EL properties Y LA PASO A LA VAR message
    String message;
    @Value("${app.varexample}") //INYECTO MI PROPIEDAD ESCRITA EN EL properties Y LA PASO A LA VAR message
    String varName;

    //Estas son pruebas para saber si funcionaba.
    @GetMapping("/saludo")
    public String saludo(){
        System.out.println("Mensaje= " + message + " Variable UserName= " + varName); //Imprimo
        return "Hola, desde el controlador de Book....";
    }


    @GetMapping("/boostrap")
    public String bootstrap(){
        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
                  </head>
                  <body>
                    <h1>Hola Mundo desde Spring Boot!</h1>
                    <a class="btn btn-primary" href="https://www.google.es"> Google </a>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
                  </body>
                </html>
                """;
    }


}
