<?php
include_once "Conectar.php";
include_once "Disciplinas.php";
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Cadastrar Disciplina</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Cadastro de Disciplinas</b></font></center>
    <br>
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-primary text-white">
            <b>Dados da Disciplina</b>
        </div>
        <div class="card-body">
            <form method="post">
                <div class="mb-3">
                    <label class="form-label"><b>Código da Disciplina:</b></label>
                    <input type="text" name="CodDisciplina" class="form-control" maxlength="2">
                </div>
                <div class="mb-3">
                    <label class="form-label"><b>Nome da Disciplina:</b></label>
                    <input type="text" name="NomeDisciplina" class="form-control" maxlength="30">
                </div>
                <center>
                    <input type="submit" name="btnSalvar" value="Salvar" class="btn btn-success">
                </center>
            </form>      
            <?php
            if (isset($_POST['btnSalvar'])) {
                $dis = new Disciplinas();
                $dis->setCodDisciplina($_POST['CodDisciplina']);
                $dis->setNomeDisciplina($_POST['NomeDisciplina']);
                echo "<div class='alert alert-success mt-3'><h3>" . $dis->salvar() . "</h3></div>";
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