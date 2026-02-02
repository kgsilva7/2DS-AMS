<?php
include_once "Conectar.php";
include_once "Alunos.php";
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Excluir Aluno</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Exclusão de Alunos Cadastrados</b></font></center>
    <br>  
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-danger text-white">
            <b>Informe a Matrícula do aluno desejado:</b>
        </div>
        <div class="card-body">
            <form method="POST">
                <div class="mb-3">
                    <label class="form-label"><b>Matrícula:</b></label>
                    <input type="text" name="txtmatricula" class="form-control" placeholder="Matrícula do Aluno">
                </div>
                <center>
                    <input type="submit" name="btnExcluir" value="Excluir" class="btn btn-danger"> &nbsp;&nbsp;
                    <input name="limpar" type="reset" value="Limpar" class="btn btn-secondary">
                </center>
            </form>       
            <?php
            extract($_POST, EXTR_OVERWRITE);
            if (isset($btnExcluir)) {
                include_once 'Alunos.php';
                $alu = new Alunos();
                $alu->setMatricula($txtmatricula);
                echo "<div class='alert alert-info mt-3'><h3>" . $alu->excluir() . "</h3></div>";
            }
            ?>
        </div>
    </div>
    <center class="mt-4">
        <a href="menu.php" class="btn btn-primary">Voltar ao Menu</a>
    </center>
</div>
</body>
</html>