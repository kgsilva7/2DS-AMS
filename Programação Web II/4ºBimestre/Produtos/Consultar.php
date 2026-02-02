<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Consulta de Produtos</title>
</head>
<body>
<center><font face = "Century Gothic" size = "6"> <b>Consulta de Produtos Cadastrados</b> <font size = "4">
<font face = "Century Gothic" size = "3"><b>
        <form name="cliente" method="POST" action="">
            <fieldset id="a">
                <legend><b>Informe o Nome do produto desejado: </b></legend>
                <p> Nome: <input name="txtnome" type="text" size="40" maxlength="40" placeholder="Nome do Produto">
                <br><br><center>
                <input name="btnenviar" type="submit" value="Consultar" class="btn btn-info"> &nbsp;&nbsp;
                <input name="limpar" type="reset" value="Limpar" class="btn btn-secondary">
            </fieldset>
            <br>
            <fieldset id="b">
                <legend><b>Resultado: </b></legend>
                <?php
                extract($_POST, EXTR_OVERWRITE);
                if(isset($btnenviar)) {
                    include_once 'Produto.php';
                    $pro = new Produto();
                    $pro->setNome($txtnome . '%');
                    $pro_bd = $pro->consultar();
                    foreach($pro_bd as $pro_mostrar) 
                    {
                    ?> <br>    
                    <b> <?php echo "id: " . $pro_mostrar[0]; ?> </b> &nbsp; &nbsp; &nbsp; &nbsp;
                    <b> <?php echo "nome: " . $pro_mostrar[1]; ?> </b>  &nbsp; &nbsp; &nbsp; &nbsp;
                    <b> <?php echo "estoque: " . $pro_mostrar[2]; ?> </b>
                    <?php
                    }
                }
                ?>
            </fieldset>
        </form>
        <center> <br><br><br><br>
        <a href="Menu.php" class="btn btn-primary mt-3">Voltar ao Menu</a>
    </div>
</body>
</html>