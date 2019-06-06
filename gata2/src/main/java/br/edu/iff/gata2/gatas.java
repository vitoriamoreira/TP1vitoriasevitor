
import static java.time.Clock.system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class gatas { 
    private int registro;
    private String nome;
    private String raça;
    private int idade;
    private String sexo; 
    public gatas (String n){
        this.nome=n;
    }
    public gatas(){
    if (idade<=1){
        system.out.println("miau")
    }else{
        system.out.println("MIAUU")
    }  
}
public class abrigo(){
    public static int main (String[]orgs){
        setRegistro(37)
        setNome("leite condensado")
        setRaça("siamês")
        setIdade(2)
        setSexo("femêa")
    }

    /**
     * @return the registro
     */
    public int getRegistro() {
        return registro;
    }

    /**
     * @param registro the registro to set
     */
    public void setRegistro(int registro) {
        this.registro = registro;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the raça
     */
    public String getRaça() {
        return raça;
    }

    /**
     * @param raça the raça to set
     */
    public void setRaça(String raça) {
        this.raça = raça;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    return 0;
}
    
}
/**
 *
 * @author aluno
 */
public interface NewInterface {
    
}
