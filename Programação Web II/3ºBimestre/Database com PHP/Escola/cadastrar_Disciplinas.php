<?php
include_once "Conectar.php";
include_once "Disciplinas.php";
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastrar Disciplina</title>
</head>
<body>
    <h2>Cadastro de Disciplinas</h2>
    <form method="post">
        Código da Disciplina: <input type="text" name="CodDisciplina" maxlength="2"><br><br>
        Nome da Disciplina: <input type="text" name="NomeDisciplina" maxlength="30"><br><br>
        <input type="submit" name="btnSalvar" value="Salvar">
    </form>

<?php
if (isset($_POST['btnSalvar'])) {
    $dis = new Disciplinas();
    $dis->setCodDisciplina($_POST['CodDisciplina']);
    $dis->setNomeDisciplina($_POST['NomeDisciplina']);

    echo "<h3>" . $dis->salvar() . "</h3>";
}
?>
</body>
</html>