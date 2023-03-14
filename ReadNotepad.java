public class ReadNotepad {
    public void readFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("NotePad.csv"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}
