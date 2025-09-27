<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $distancia = floatval($_POST['distancia']);
    $combustivel = floatval($_POST['combustivel']);
    if ($combustivel > 0) {
        $consumo_medio = $distancia / $combustivel;
        echo "Consumo médio: " . number_format($consumo_medio, 2, ',', '.') . " km/l";
    } else {
        echo "O combustível consumido deve ser maior que zero.";
    }
}
?>