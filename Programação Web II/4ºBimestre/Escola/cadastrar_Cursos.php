<?php
include_once "Conectar.php";
include_once "Cursos.php";
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Cadastrar Curso</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Cadastro de Cursos</b></font></center>
    <br>
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-primary text-white">
            <b>Dados do Curso</b>
        </div>
        <div class="card-body">
            <form method="post">
                <div class="mb-3">
                    <label class="form-label"><b>Código do Curso:</b></label>
                    <input type="text" name="codcurso" class="form-control" maxlength="2">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Nome do Curso:</b></label>
                    <input type="text" name="nome" class="form-control" maxlength="50">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Cód. Disciplina 1:</b></label>
                    <input type="text" name="coddisc1" class="form-control" maxlength="2">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Cód. Disciplina 2:</b></label>
                    <input type="text" name="coddisc2" class="form-control" maxlength="2">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Cód. Disciplina 3:</b></label>
                    <input type="text" name="coddisc3" class="form-control" maxlength="2">
                </div>
                <center>
                    <input type="submit" name="btnSalvar" value="Salvar" class="btn btn-success">
                </center>
            </form>          
            <?php
            if (isset($_POST['btnSalvar'])) {
                $cur = new Cursos();
                $cur->setCodcurso($_POST['codcurso']);
                $cur->setNome($_POST['nome']);
                $cur->setCoddisc1($_POST['coddisc1']);
                $cur->setCoddisc2($_POST['coddisc2']);
                $cur->setCoddisc3($_POST['coddisc3']);
                echo "<div class='alert alert-success mt-3'><h3>" . $cur->salvar() . "</h3></div>";
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