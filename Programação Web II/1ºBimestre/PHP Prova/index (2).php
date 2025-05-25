<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Desconto</title>
    <link rel="stylesheet" href="style.css">
</head>
<body class="body1">
    <header>

        <h1>Desconto</h1>

    </header>

    <section>

        <form class="form1"  method="post">

        <strong>

            Distância total (Em KM):

        </strong>    
        <br>
        <input type="text" name="DT" class="num" required>
        <br>
        <br>
        <strong>

            Combustível consumido (Em litros):

        </strong> 
        <br>
        <input type="text" name="CCL" class="num" required>
        <br>         

        <input type="submit" value="Confirmar" id="confirmar">


        </form>

    </section>

    <section>

    <?php 

    function ConsumoMédio($DT, $CCL){
        $CM = $DT/$CCL;
        echo "<strong>" . "O consumo médio foi de: " . $CM . "</strong>";
    }
    
    if(isset($_POST['DT']) && isset($_POST['CCL'])){
    $DistTotal = $_POST['DT'];  
    $CombCons = $_POST['CCL'];
    ConsumoMédio($DistTotal, $CombCons);
    }
    else{
        echo "Insira os valores";
    }
?>

    </section>

    <footer>

        <h4>Atividade Realizada Por: Antonio B. de Sena Neto</h4>

    </footer>

</body>
</html>