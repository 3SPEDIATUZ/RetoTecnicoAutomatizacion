#Autor: Jorge Ivan Ortega Sanchez
  @stories
  Feature: Academy Choucair
    Como usuario no registrado, quiero registrarme en la uTest con el fin de probar
  @scenario1
  Scenario: Registrarse la pagina uTest
    Given Dado que Juan quiere probar su codigo automatizacion abrimos la pagina Utest.com
    When  Cuando abre el formulario registro, se llenan todos los campos
    | strFirtsName | strLastName         | strEmail                     | strMoth | strDay | strYear | strCity| strZip | strCountry| strComputer|strVersion|strLanguage|strMobileDevice|strModel   |strOperatingSystem|strPassword | strRepassword|
    | Jorge Ivan   | Ortega Sanchez | ing.jorgeivanortegasanchez@gmail.com       | September     | 13     | 1997    | Cucuta | 570010 | Colombia  | Windows    |11        | spanish   |huawei        |nova 5T  |android 10        | Ivansanchez97| Ivansanchez97 |
    Then  Luego se registra correctamente el usuario encuentra el mensaje
    | question                                                                |
    | Welcome to the world's largest community of freelance software testers! |