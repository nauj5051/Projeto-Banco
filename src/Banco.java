import java.util.spi.ToolProvider;

import javax.sound.sampled.SourceDataLine;

public class Banco {
    public int numeroconta;
    protected String tipoconta;
    private String seunome;
    private float saldodaconta;
    private boolean status;
    
    public void suaconta(){
        System.out.println("SEU NOME É:" + seunome);
        System.out.println("SEU TIPO DE CONTA É?" + tipoconta);
        System.out.println("SEU SALDO NÚMERO DE CONTA É?" + numeroconta);
        System.out.println("SEU SALDO NA CONTA É:" +saldodaconta);
        System.out.println("SEU STATUS É:" + status);
    }
    
    public Banco(){
        saldodaconta = 0;
        status = false;
    }

    public int getNumeroconta() {
        return numeroconta;
    }
    public void setNumeroconta(int numeroconta) {
        this.numeroconta = numeroconta;
    }
    public String getTipoconta() {
        return tipoconta;
    }
    public void setTipoconta(String tipoconta) {
        this.tipoconta = tipoconta;
    }
    public String getSeunome() {
        return seunome;
    }
    public void setSeunome(String seunome) {
        this.seunome = seunome;
    }
    public float getSaldodaconta() {
        return saldodaconta;
    }
    public void setSaldodaconta(float saldodaconta) {
        this.saldodaconta = saldodaconta;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void abrirConta(String tipo){ 
        this.setTipoconta(tipo);
        this.setStatus(true);
        if("CC".equals(tipo)){
            System.out.println("CONTA ABERTA COM SUCESSO");
            this.setSaldodaconta(50F);
        }
        else{
            if ("CP".equals(tipo)){
                System.out.println("CONTA ABERTA COM SUCESSO");
                this.setSaldodaconta(150F);
            }
        }   
    }

    public void fecharConta(){
        if(this.getSaldodaconta() < 0){
          System.out.println("A CONTA ESTÁ DEVEnDO");      
        }
        else{
            if(getSaldodaconta() > 0){
                System.out.println("A CONTA ESTÁ COM DINHEIRO");      
            }
            else{
              this.setStatus(false);
              System.out.println("CONTA FECHADA COM SUCESSO");      
            }
        }

    }
    public void depositar(float valor){
        if(status = true){
            this.setSaldodaconta(this.getSaldodaconta() + valor);
            System.out.println("DEPOSITO FEITO NA CONTA DE:" + getSeunome());
            System.out.println("Seu valor agora é:" + saldodaconta);
        }
        else{
            System.out.println("IMPOSSÍVEL DEPOSITAR");
        }
    }
    public void sacar(Float sacar){
        if(status = true){
            if( this.getSaldodaconta() >= sacar){
                this.setSaldodaconta(this.getSaldodaconta() - sacar);
                System.out.println("SAQUE FEITO NA CONTA DE:" + getSeunome());
                System.out.println("Seu valor agora é:" + saldodaconta);

            } 
            else{
                System.out.println("SALDO INSUFICIENTE");
            }
        }
        else{
            System.out.println("IMPOSSÍVEL SACAR");
        }
    }
    public void pagarMensal(){
        int pagar = 0;
        if(getTipoconta() == "CC"){
            pagar = 12;
        }
        else{
            if(getTipoconta() == "CP"){
                pagar = 20;
            }
        }
        if(status = true){
            if(getSaldodaconta() > pagar){
                this.setSaldodaconta(getSaldodaconta() - pagar);
                System.out.println("MENSALIDADE PAGA COM SUCESSO NA CONTA DE:" + getSeunome());
                System.out.println("SEU SALDO AGORA É DE:" + saldodaconta);
            }
            else{
                System.out.println("SADO INSUFICIENTE");
            }        
        }
        else{
            System.out.println("impossível pagar");
        }
       
    }
}
