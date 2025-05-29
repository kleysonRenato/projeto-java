public String processarcaminho(String caminho) {
    FileReader arquivo = null;

    try {
        arquivo = new FileReader(caminho);
        BufferedReader leitor = new BufferedReader(arquivo);
        String linha;
        while ((linha = leitor.readLine()) != null) {
            System.out.println(linha);
        }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        if (arquivo != null) {
            try {
                arquivo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    return caminho.substring(
        caminho.lastIndexOf(File.separator) + 1,
        caminho.length()
    );
}
