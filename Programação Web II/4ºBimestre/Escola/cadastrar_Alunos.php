<?php
include_once "Conectar.php";
include_once "Alunos.php";
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Cadastrar Aluno</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Cadastro de Alunos</b></font></center>
    <br>   
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-primary text-white">
            <b>Dados do Aluno</b>
        </div>
        <div class="card-body">
            <form method="post">
                <div class="mb-3">
                    <label class="form-label"><b>Matrícula:</b></label>
                    <input type="text" name="matricula" class="form-control" maxlength="5">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Nome:</b></label>
                    <input type="text" name="nome" class="form-control" maxlength="50">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Endereço:</b></label>
                    <input type="text" name="endereco" class="form-control" maxlength="50">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Cidade:</b></label>
                    <input type="text" name="cidade" class="form-control" maxlength="30">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Código do Curso:</b></label>
                    <input type="text" name="codcurso" class="form-control" maxlength="2">
                </div>
                <center>
                    <input type="submit" name="btnSalvar" value="Salvar" class="btn btn-success">
                </center>
            </form>      
            <?php
            if (isset($_POST['btnSalvar'])) {
                $alu = new Alunos();
                $alu->setMatricula($_POST['matricula']);
                $alu->setNome($_POST['nome']);
                $alu->setEndereco($_POST['endereco']);
                $alu->setCidade($_POST['cidade']);
                $alu->setCodcurso($_POST['codcurso']);
                echo "<div class='alert alert-success mt-3'><h3>" . $alu->salvar() . "</h3></div>";
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