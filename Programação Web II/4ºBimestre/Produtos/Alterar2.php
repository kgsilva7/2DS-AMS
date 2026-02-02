<?php
if (isset($_POST["txtid"])) {
    $txtid = $_POST["txtid"];
    include_once 'Produto.php';
    $pro = new Produto();
    $pro->setId($txtid);
    $pro_bd = $pro->alterar();
} else {
    $pro_bd = [];
}
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alteração de Produtos</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Alteração de Produtos Cadastrados</b></font></center>
    <br>
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-warning text-dark">
            <b>Alterar</b>
        </div>
        <div class="card-body">
            <form name="cliente2" method="POST" action="">
                <?php
                if (!empty($pro_bd)) {
                    foreach($pro_bd as $pro_mostrar) {
                ?>
                <input type="hidden" name="txtid" value='<?php echo $pro_mostrar[0]?>'>
                <div class="mb-3">
                    <label class="form-label"><b>ID: <?php echo $pro_mostrar[0]; ?></b></label>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Nome:</b></label>
                    <input type="text" name="txtnome" class="form-control" value='<?php echo $pro_mostrar[1]?>'>
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Estoque:</b></label>
                    <input type="text" name="txtestoque" class="form-control" value='<?php echo $pro_mostrar[2]?>'>
                </div>
                <center>
                    <input name="btnalterar" type="submit" value="Alterar" class="btn btn-warning">
                </center>
                <?php
                    }
                } else {
                    echo "<p class='text-center'>Nenhum produto encontrado com esse ID.</p>";
                }
                ?>
            </form>    
            <?php
            extract($_POST, EXTR_OVERWRITE);
            if(isset($btnalterar))
            {
                include_once 'Produto.php';
                $pro = new Produto();
                $pro->setNome($txtnome);
                $pro->setEstoque($txtestoque);
                $pro->setId($txtid);
                echo "<div class='alert alert-success mt-3'><h3>" . $pro->alterar2() . "</h3></div>";
                header("refresh:2; url=Menu.php");
            }
            ?>
        </div>
    </div>
    <center class="mt-4">
        <a href="Menu.php" class="btn btn-primary">Voltar ao Menu</a>
    </center>
</div>
</body>
</html>