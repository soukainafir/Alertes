<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="form.css" />
    </head>
    <body>
        <form method="post" action="Inscription">
            <fieldset>
                <legend>Inscription</legend>
                <p>Vous pouvez vous inscrire via ce formulaire.</p>

                
                <label for="Id_user">Id user <span class="requis">*</span></label>
                <input type="text" id="Id_user" name="Id_user" value="" size="20" maxlength="20" />
                
                <br />

                <label for="nom">Username</label>
                <input type="text" id="nom" name="nom"  />
                
                <br />

                <input type="submit" value="Inscription" class="sansLabel" />
                <br />
                
                
            </fieldset>
        </form>
    </body>
</html>