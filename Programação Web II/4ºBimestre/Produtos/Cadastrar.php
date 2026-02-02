<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Cadastro de Produto</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Cadastro de Produtos</b></font></center>
    <br>   
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-primary text-white">
            <b>Dados do Produto:</b>
        </div>
        <div class="card-body">
            <form name="cliente" method="POST" action="">
                <div class="mb-3">
                    <label class="form-label"><b>Nome:</b></label>
                    <input name="txtnome" type="text" class="form-control" placeholder="Nome do Produto" maxlength="40">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Estoque:</b></label>
                    <input name="txtestoq" type="text" class="form-control" placeholder="0">
                </div>
                
                <div class="card mt-4">
                    <div class="card-header bg-secondary text-white">
                        <b>Opções:</b>
                    </div>
                    <div class="card-body">
                        <center>
                            <input name="btnenviar" type="submit" value="Cadastrar" class="btn btn-success"> &nbsp;&nbsp;
                            <input name="limpar" type="reset" value="Limpar" class="btn btn-secondary">
                        </center>
                    </div>
                </div>
            </form>         
            <?php
            extract($_POST, EXTR_OVERWRITE);
            if (isset($btnenviar)) 
            {
                include_once 'Produto.php';
                $pro = new Produto();
                $pro->setNome($txtnome);
                $pro->setEstoque($txtestoq);
                echo "<div class='alert alert-success mt-3'><h3>" . $pro->salvar() . "</h3></div>";
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