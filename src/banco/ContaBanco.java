/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author jose2
 */
public class ContaBanco {
    public int numConta ;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
 
//    CONSTRUTOR    
    public ContaBanco(){
        this.saldo = 0;
        this.status = true;
    }
    
// STATUS ATUAL
    public void estadoAtual(){
        System.out.println("==================");
        System.out.println("Conta " + this.getNumConta());
        System.out.println("Tipo de conta "+ this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.getStatus());
        System.out.println("==================");

    }
    
// ========  A T R I B U T O S =======================    
    //NUMERO DA CONTA
    public int getNumConta(){
        return this.numConta;
    }
    public void setNumConta(int c){
        this.numConta = c;
    }
    
    //TIPO DA CONTA
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo=t;
    }    
        
    // DONO DA CONTA
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
        
    }    
    // SALDO
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo= s;
    }
    
    // STATUS
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean sta){
        this.status = sta;
    }
    
//================ M É T O D O S ===================
    
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t=="CC"){
            setSaldo(50);
        }else {
            setSaldo(150);
        }
    }
    
    public void fecharConta(){
        if (saldo>0){
            System.out.println("ERRO! Conta com dinheiro!");
        }else if (saldo < 0){
            System.out.println("Cliente com débito no banco. Conta não encerrada!");
        }else {
            setStatus(false);
            System.out.println("Ok, conta encerrada");
        }
        
    }
    
    public void depositar (float v){
        if (status == true){
            saldo = saldo + v;
        }else{
            System.out.println("IMPOSSIVEL DEPOSITAR. CONTA INATIVA!");
        }
        
    }

    public void sacar (float v){
        if (status==true){
            if (saldo>v){
                saldo = saldo - v;
            }else{
                System.out.println("Saldo insuficiente");
        }}else{
                System.out.println("Impossivel sacar");
    }
    
    
      
    }
    public void pagarMens(){
        int v = 0;
        if (this.getTipo()=="CC") {
            v=12;
        } else {
            v=20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Impossivel pagar conta fechada");
        }
    }


}
