<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $valor = floatval($_POST['valor']);
    $total = $valor * 1.16;
    $parcela = $total / 10;
    echo "Valor total com acréscimo: R$" . number_format($total, 2, ',', '.') . ;
    echo "Valor de cada parcela: R$" . number_format($parcela, 2, ',', '.') . ;
}
?>
