<?php
include_once 'Conectar.php';
class Disciplinas
{
    private $CodDisciplina;
    private $NomeDisciplina;

    public function getCodDisciplina() { return $this->CodDisciplina; }
    public function setCodDisciplina($CodDisciplina) { $this->CodDisciplina = $CodDisciplina; }
    
    public function getNomeDisciplina() { return $this->NomeDisciplina; }
    public function setNomeDisciplina($NomeDisciplina) { $this->NomeDisciplina = $NomeDisciplina; }

      public function listar()
    {
        try {
            @$this->$conn = new Conectar();
            @$sql = $this->$conn->query("SELECT * FROM disciplinas order by CodDisciplina");
            $sql->execute();
            return $sql->fetchAll();
            $this->$conn = null;
        } catch (PDOException $e) {
            echo "Erro ao listar disciplinas: " . $e->getMessage();
            return [];
        }
    }

    public function salvar()
    {
        try {
            @$this->$conn = new Conectar();
            @$sql = $this->$conn->prepare("INSERT INTO disciplinas (CodDisciplina, NomeDisciplina) VALUES (?, ?)");
            @$sql->bindParam(1, $this->CodDisciplina, PDO::PARAM_STR);
            @$sql->bindParam(2, $this->NomeDisciplina, PDO::PARAM_STR);

            if ($sql->execute()) {
                return "Disciplina salva com sucesso!";
            }
        } catch (PDOException $e) {
            echo "Erro ao salvar disciplina: " . $e->getMessage();
            return "Erro ao salvar disciplina!";
        }
    }
}
?>