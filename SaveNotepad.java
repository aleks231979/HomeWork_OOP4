public class SaveNotepad<E> {
    public void save(List<E> list) {

        try (FileWriter fw = new FileWriter("NotePad.csv", true)) {

            for (E el : list) {
                fw.write(el.toString());
                fw.append('\n');
                fw.append("************************************");
                fw.append('\n');
            }
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
