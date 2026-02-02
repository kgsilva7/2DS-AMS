<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Consulta de Cursos</title>
</head>
<body>
<center>
    <font face="Century Gothic" size="6"><b>Consulta de Cursos Cadastrados</b></font>
    <br><br>
    <form name="cursos" method="POST" action="">
        <fieldset id="a">
            <legend><b>Informe o Nome do Curso: </b></legend>
            <p> Nome: <input name="txtnome" type="text" size="40" maxlength="40" placeholder="Nome do Curso">
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
                include_once 'Cursos.php';
                $cur = new Cursos();
                $cur->setNome($txtnome . '%');
                $cur_bd = $cur->consultar();
                foreach($cur_bd as $cur_mostrar) {
                    ?> <br>    
                    <b><?php echo "Código: " . $cur_mostrar[0]; ?></b> &nbsp;&nbsp;
                    <b><?php echo "Nome: " . $cur_mostrar[1]; ?></b> &nbsp;&nbsp;
                    <b><?php echo "Disciplina 1: " . $cur_mostrar[2]; ?></b> &nbsp;&nbsp;
                    <b><?php echo "Disciplina 2: " . $cur_mostrar[3]; ?></b> &nbsp;&nbsp;
                    <b><?php echo "Disciplina 3: " . $cur_mostrar[4]; ?></b>
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