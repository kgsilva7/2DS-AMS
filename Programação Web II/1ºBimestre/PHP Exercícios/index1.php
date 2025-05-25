<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $area = floatval($_POST['area']);
    $litros = $area / 6; 
    $capacidade_lata = 18;
    $preco_lata = 80.00;
    $capacidade_galao = 3.6;
    $preco_galao = 25.00;
    if ($litros >= $capacidade_lata) {
        $quantidade_latas = ceil($litros / $capacidade_lata);
        $custo_total = $quantidade_latas * $preco_lata;
        echo "Comprar apenas $quantidade_latas latas de 18Litros";
    } else {
        $quantidade_galoes = ceil($litros / $capacidade_galao);
        $custo_total = $quantidade_galoes * $preco_galao;
        echo "Comprar apenas $quantidade_galoes galões de 3.6Litros";
    }  
    echo "<p>Custo total: R$" . number_format($custo_total, 2, ',', '.') . "</p>";
}
?>