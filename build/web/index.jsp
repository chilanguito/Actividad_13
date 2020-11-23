<%-- 
    Document   : index
    Created on : 20/11/2020, 08:41:35 PM
    Author     : diegonarvaez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <br>
        <br>
        <br>
        <img src="imagenes/diego.jpeg" width="200" align="left">
    <center> <font size=6 color="black"> <b> <i> Alumno: Diego Narvaez </i> </b> </font>  </center>  
    <br>

    <center> <fieldset style="border:5px solid #2874A6; width:400px;">
            <legend> <font size=5 > Sistemas criptográficos </font> </legend>
            <form name='formulario' action="prueba_serv" method="post" id ="form">           
                <table  width="100%">
                    <tr> 
                        <td width="20%">
                            Mensaje a encriptar:
                        </td> 
                    </tr>
                    <tr>
                        <td  width="100%">
                            <textarea id="texto" form="form" name="textArea"></textarea>
                        </td>
                    </tr>

                    <tr>
                        <td>
                            Seleccione una actividad: 
                            <br>


                            <select name="select">
                                <option value="value1">Sistema simple</option> 
                                <option value="value2" selected>Sistema del césar</option>
                               
                            </select>

                        </td></tr>

                    <tr>
                        <td>
                            <input type="submit" value="aceptar" name="btnAceptar" id="button">
                        </td>
                        <td>
                            <input type="reset" value="Nuevo" name="btnLimpiar" onclick="reset()" id="button">
                        </td>
                    </tr>

                </table>

            </form>

        </fieldset> </center>
</body>
</html>
