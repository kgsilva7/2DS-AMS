<?php
include_once "Conectar.php";
include_once "Cursos.php";
?>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <title>Cadastrar Curso</title>
</head>
<body>
    <h2>Cadastro de Cursos</h2>
    <form method="post">
        Código do Curso: <input type="text" name="codcurso" maxlength="2"><br><br>
        Nome do Curso: <input type="text" name="nome" maxlength="50"><br><br>
        Cód. Disciplina 1: <input type="text" name="coddisc1" maxlength="2"><br><br>
        Cód. Disciplina 2: <input type="text" name="coddisc2" maxlength="2"><br><br>
        Cód. Disciplina 3: <input type="text" name="coddisc3" maxlength="2"><br><br>
        <input type="submit" name="btnSalvar" value="Salvar">
    </form>
<?php
if (isset($_POST['btnSalvar'])) {
    $cur = new Cursos();
    $cur->setCodcurso($_POST['codcurso']);
    $cur->setNome($_POST['nome']);
    $cur->setCoddisc1($_POST['coddisc1']);
    $cur->setCoddisc2($_POST['coddisc2']);
    $cur->setCoddisc3($_POST['coddisc3']);

    echo "<h3>" . $cur->salvar() . "</h3>";
}
?>
</body>
</html>