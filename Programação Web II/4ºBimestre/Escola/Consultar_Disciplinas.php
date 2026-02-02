<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Consulta de Disciplinas</title>
</head>
<body>
<center>
    <font face="Century Gothic" size="6"><b>Consulta de Disciplinas Cadastradas</b></font>
    <br><br>
    <form name="disciplinas" method="POST" action="">
        <fieldset id="a">
            <legend><b>Informe o Nome da Disciplina: </b></legend>
            <p> Nome: <input name="txtnome" type="text" size="40" maxlength="40" placeholder="Nome da Disciplina">
            <br><br>
            <input name="btnenviar" type="submit" value="Consultar" class="btn btn-info"> &nbsp;&nbsp;
            <input name="limpar" type="reset" value="Limpar" class="btn btn-secondary">
        </fieldset>
        <br>
        <fieldset id="b">
            <legend><b>Resultado: </b></legend>
            <?php
            extract($_POST, EXTR_OVERWRITE);
            if(isset($btnenviar)) {
                include_once 'Disciplinas.php';
                $disc = new Disciplinas();
                $disc->setNomeDisciplina($txtnome . '%');
                $disc_bd = $disc->consultar();
                foreach($disc_bd as $disc_mostrar) {
                    ?> <br>    
                    <b><?php echo "Código: " . $disc_mostrar[0]; ?></b> &nbsp;&nbsp;
                    <b><?php echo "Nome: " . $disc_mostrar[1]; ?></b>
                    <?php
                }
            }
            ?>
        </fieldset>
    </form>
    <br><br>
    <a href="menu.php" class="btn btn-primary mt-3">Voltar ao Menu</a>
</center>
</body>
</html>