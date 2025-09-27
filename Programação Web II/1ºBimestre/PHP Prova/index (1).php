<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <title>Parcelas</title>
    <link rel="stylesheet" href="style.css">
</head>
<body class="body1">
    <header>

        <h1>Calcular Parcelas</h1>

    </header>

    <section>

        <form class="form1"  method="post">

        <strong>

            Valor do Produto:

        </strong>    
        <br>
        <input type="text" name="VlrProd" class="num" required>
        <br>      

        <input type="submit" value="Confirmar" id="confirmar">


        </form>

    </section>

    <section>

    <?php 

    function Calcular($vlrProd){

        $Soma = $vlrProd*16/100;
        $VlrCSoma = $vlrProd + $Soma;
        $parcela = $VlrCSoma/10;    
        echo "O valor do produto com desconto é: " . "<strong>" . $VlrCSoma . "</strong>" . "<br>" . "O valor das parcelas é: " . "<strong>" . $parcela . "</strong>";

    }
    
    if(isset($_POST['VlrProd'])){
    $vlr = $_POST['VlrProd'];  
    Calcular($vlr);
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