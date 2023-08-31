#language: es
  Característica: Registro en la pagina

    Esquema del escenario: :Reguistrarse en la pagina Web
      Dado Que estoy en la pagina
      Cuando Reguistrare mis datos <nombre> <apellido> <email> <mes> <dia> <ano> <contrasena> <confirmacionContrasena>
      Entonces valido si el usuario esta creado
      Ejemplos:
        | nombre| apellido|     email  |       mes| dia|  ano|          contrasena| confirmacionContrasena|
        | Daniel| Alzate  | d@yahoo.com|   July|  02| 1998|123456789A-Raul34567|   123456789A-Raul34567|

