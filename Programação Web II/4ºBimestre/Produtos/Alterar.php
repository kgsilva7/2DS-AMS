<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alteração</title>
</head>
<body>
<center><font face = "Century Gothic" size = "6"> <b>Alteração de Produtos Cadastrados</b> <font size = "4"></center><br>
<font size = "3">
<form name="cliente" method="POST" action = "Alterar2.php">
    <fieldset>
        <legend><b> Informe o ID do Produto desejado: </b><legend>
             <p> Nome: <input name="txtid" type="text" size="20" maxlength="5" placeholder="Id do Produto">
            <br><br><center>
            <input name="btnenviar" type="submit" value="Consultar" class="btn btn-info"> &nbsp;&nbsp;
            <input name="limpar" type="reset" value="Limpar" class="btn btn-secondary">
    </fieldset>
</form>
<center> <br><br><br><br>
        <a href="Menu.php" class="btn btn-primary mt-3">Voltar ao Menu</a>
    </div>
</body>
</html>