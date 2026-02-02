<?php
include_once "Conectar.php";
include_once "Cursos.php";
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Alterar Curso</title>
</head>
<body>
<div class="container mt-5">
    <center><font face="Century Gothic" size="6"><b>Alteração de Cursos Cadastrados</b></font></center>
    <br>   
    <div class="card mx-auto" style="max-width: 600px;">
        <div class="card-header bg-warning text-dark">
            <b>Informe o Código do curso desejado:</b>
        </div>
        <div class="card-body">
            <form method="POST" action="Alterar_Cursos2.php">
                <div class="mb-3">
                    <label class="form-label"><b>Código:</b></label>
                    <input name="txtcodcurso" type="text" class="form-control" placeholder="Código do Curso" maxlength="2">
                </div>
                <center>
                    <input name="btnConsultar" type="submit" value="Consultar" class="btn btn-warning"> &nbsp;&nbsp;
                    <input name="limpar" type="reset" value="Limpar" class="btn btn-secondary">
                </center>
            </form>
        </div>
    </div>
    <center class="mt-4">
        <a href="menu.php" class="btn btn-primary">Voltar ao Menu</a>
    </center>
</div>
</body>
</html>