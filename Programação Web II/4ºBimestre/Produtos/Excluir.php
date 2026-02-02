<!DOCTYPE html>
<html>
<head>
    <meta charset =     "UTF-8">
    <link href = "https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Exclusão de Produtos</title>
</head>
<body>
<center><font face = "Century Gothic" size = "6"><b>Exclusão de Produtos Cadastrados</b><font size = "4">
<font face = "Century Gothic" size = "3"><b>
        <form name = "cliente" method = "POST" action = "">
            <fieldset id = "a">
                <legend><b> Informe o ID do produto desejado: </b></legend>
                <p> Id: <input name ="txtid" type = "text" size = "20" maxlength = "5" placeholder = "Id do Produto">
                <br><br><center>
                <input name = "btnenviar" type = "submit" value = "Excluir" class = "btn btn-danger"> &nbsp;&nbsp;
                <input name = "limpar" type = "reset" value = "Limpar" class = "btn btn-secondary">
            </fieldset>
            <fieldset id = "b">
            <legend><b> Resultado: </b></legend>
        </form>
        <?php
        extract($_POST, EXTR_OVERWRITE);
        if(isset($btnenviar)) {
            include_once 'Produto.php';
            $pro = new Produto();
            $pro->setId($txtid);
            echo "<h3>" . $pro->excluir() . "</h3>";
        }
        ?>
        <br>
        <a href = "Menu.php" class = "btn btn-primary mt-3">Voltar ao Menu</a>
    </div>
</body>
</html>