<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Tintas</title>
    <link rel="stylesheet" href="style.css">
</head>
<body class="body1">
    <header>

        <h1>Latas de Tinta</h1>

    </header>

    <section>

        <form class="form1"  method="post">

        <strong>

            Área em Metros Quadrados:

        </strong>    
        <br>
        <input type="text" name="MQuad" class="num" required>
        <br>      

        <input type="submit" value="Confirmar" id="confirmar">


        </form>

    </section>

    <section>

    <?php 

    function Calcular($MQuad){

        $litros = round($MQuad/6, 2);
        if($litros >= 18){  
            $quant = round($litros/18, 2);
            $valor = round($quant*80, 2);
            echo "Será necessário: " . $litros . " litros de tinta " . "<br>" . "<br>" . " serão necessárias: " . $quant . " Latas de tinta " . "<br>". "<br>" . " E isso vai custar: " . $valor;
        }
        else{
            $quant = round($litros/3.6, 2);
                $valor = $quant*25;
                echo "Será necessário: " . $litros . " litros de tinta " . "<br>" . "<br>" . " serão necessárias: " . $quant . " Latas de tinta " . "<br>". "<br>" . " E isso vai custar: " . $valor;
        }
        }


    
    if(isset($_POST['MQuad'])){
    $MQ = $_POST['MQuad'];
    if(is_numeric($MQ) && $MQ > 0){
        Calcular($MQ);
    }
    else{
        echo "Inválido";
    }
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