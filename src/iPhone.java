public class iPhone implements InterfaceLigacao, InterfaceMusical, InterfaceNavegador{
    private String modelo;
    private int armazenamento;

    public iPhone(String modelo, int armazenamento){
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    

    public static void main(String[] args) {
        
    }


    @Override
    public void abrirPagina(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'abrirPagina'");
    }



    @Override
    public void fecharPagina() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fecharPagina'");
    }



    @Override
    public void pesquisar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesquisar'");
    }



    @Override
    public void tocarMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tocarMusica'");
    }



    @Override
    public void pausarMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pausarMusica'");
    }



    @Override
    public void pararMusica() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pararMusica'");
    }



    @Override
    public void fazerChamada(String numero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fazerChamada'");
    }



    @Override
    public void receberChamada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'receberChamada'");
    }



    @Override
    public void encerrarChamada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encerrarChamada'");
    }
}
