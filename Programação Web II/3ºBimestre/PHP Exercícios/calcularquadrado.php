<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pagina calcularquadrado.php</title>
</head>
<body>
    <?php
    $A = $_POST['txta'];
    $B = $_POST['txtb'];
    $soma = $A + $B;
    $quadr = pow($soma, 2);
    echo "A soma dos valores é" . $soma . '<br>';
    echo "O quadrado da soma é" . $quadr;
    ?>
</body>
</html>