package comp1110.homework.J08;

public class Sentence {

    public int size;
    public  Word[] words;

    public static class Word {
        String value;
        Type type;

        public enum Type {NOUN, ADJECTIVE, VERB};

        Word(String value, Type type) {
            this.value = value;
            this.type = type;
        }
    }

    Sentence(int size) {
        this.size = size;
        words = new Word[size];
    }

    public boolean isValid() {
        if (size < 1) {
            return false;
        }

        int countVerb = 0;
        for (int i = 0; i < size - 1; i += 1) {
            if (words[i].type == Word.Type.NOUN && words[i + 1].type != Word.Type.VERB) {
                return false;
            }
            if (words[i].type == Word.Type.ADJECTIVE && words[i + 1].type != Word.Type.ADJECTIVE && words[i + 1].type != Word.Type.NOUN) {
                return false;
            }
            if (words[i].type == Word.Type.VERB) {
                countVerb += 1;
            }
        }

        if (words[size - 1].type == Word.Type.VERB) {
            countVerb += 1;
        }
        if (countVerb != 1) {
            return false;
        }
        if (words[size - 1].type != Word.Type.VERB && words[size - 1].type != Word.Type.NOUN) {
            return false;
        }

        return true;
    }
}
