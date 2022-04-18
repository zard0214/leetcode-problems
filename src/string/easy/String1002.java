package string.easy;

import java.util.*;

/**
 * @author zard
 * @date Created in 04/10/2021 15:30
 */
public class String1002 {
    public static void main(String[] args) {
        String[] words = {"dbcdjbedfchcbhbecbadeaefefhcaagfghjaidaadeaabaaegj","hfacgbgcieccadeejddegjffejdjegejbaddaiabdhahbjaiba","igfaddihhceieadjgjhefaibcfcichcdecjcihfhcgfjeihidf","jaehjjibbhfdcjjdhecicefjjjdabibahgdaeibfefbbffhjja","degddigjijggagjgaaeeegfiahhcghbefcbdabeehbihjdeabi","bjdfedddebaifgadhgdhfjjdafajhiabbjjiidhcdaagajiafh","ihfjgjjcfeebebjgihdejjdheaeeddiajffjjdbfcfdaabgcei","jdbhhhigagieacgdabbchegdaefgeebaccdeajiifgfecbdgig","djhghabfejhcgbdejfcafjbagecbdggehaaddicgejhdgdahaf","hbaaccbffecibeiabdfeggbahbiehjiejifjjjbbbiiejcejdf","fadeddbhjehehhjiiehigjdaaiaaebjdaicbefacedfcgbegge","djhidhibeghjfbdgabgeejgedifdageichiijachhjfeihfieb","jdiagceichahjbjadhagegbbedhijhgefhfcbhdeefeahghfde","chhbbaeaeacaccbjiegfadfhabbchjggidahbgdhcadafjfifa","cdiabdbeaeefjiaadigdgiihajgcbghcfdhicjjfeiciaidjfh","gfehabegchgidgjbhdighfjbeajhdfaebificjaeahiajjgeab","agafjbjjhadjaichgfihehdhfaiiaffbijeahegjgfcidhhbed","gchagffchcjjadhbhhjfiiagejchbgjabadjcbdigdfdfabgee","ciacjdahajifafhbfbdaddbgbddedhjbbbdbbbfhcidfcbiijg","dbjjbajjgehcbgfaibjjcbigaijdjaagbfbfcjebahjchdfacg","bgfifecddgcfefijhccjiaiedhaeahihehiaedjfebejceibid","hiiigbiddhhejdebjcgjgdfiaijieibbaiibecbjigadejaibj","hafbbjafdjahdhdfiafedjjdgjghcfffcjedgjeffbeahfgbcf","bfcjigdiadjhfjjbghcdhchgaiefdijgcbbcjfaehccgddigah","aehfeiccfieaihijcgfahceadeiffefiegciageeaieghadgda","eafcdbagdafjdbicbabhihfhiefdiehhiiijigfhajfcbgajff","ecgdieegbfcijifhgicihhfhgbebgbjiiegbbfhijbcbecgigd","idhjgaccgaaieidbeidbcadhidhdddgjceccjgehjcidebeidi","bchhdjiiacccidhhcbchehcaddeccfecbcedidhhbjcigddhfg","ieddgabeciffjfchdggifjcebadchbdcdgiagefhecifgifdcj","bedcfhjehehdhafeadbdffbadjhgefjdchjghjedhgadihaedc","cfhcigdaaaddfjifaadejdgdfdfdhfebicfedcefbcgbbdbibh","jbddeaghjegebciaihfjffceiaehgaeecijefafficbajehgej","dbejheeaeadbaifegcjjhahggdbgjbeieghbeijjedjdbfiecc","dgdbefabibgeehgbdjggidagdfhjdgahbjidgejjfgcafcjddf","hcbaggjggcbcgjbceihbghdhbediacdfgfheghddecedddjggf","cdhhaaieachbfgcigidjfjcihecdegifedhadgacieciihafhf","hhicegfcdihbddjaibadeacbjdjjhjdeegjjaedgjegbbbbifg","bjcggafgaajegfcihfaicfhcdfdhgfegjfcbadighbciadhcfd","cabdajhgciaihgdccghbjcbgfighjideehbejjhhihgdjebgje","caaafahejcbedgibhadcfddaejhhaaicejefeghjhijcbfaegd","fggbheafgcbgdcfibiajdachcifhcfdfebbfcjfgefebebbdcc","gdiabbdaicaijehcjhhibbeeidjdjicdbddiaacciehehdbhch","ddbahiacdhccafecfhihfhdeicghdjbfbdehcjdhjhjehdfjhc","hadjggchcjdfaaicggigjgjaeegjfccccejeghbfcgajeccfee","ghcafaieijddfiebcibdccjijafiieeidjdiadbcjhbdjaeiec","gdfjagafhcaihhejfjcjecccfbcidhcidffebcigjdbafjgieh","ifafgibebjghgiaachefhggeibejfdhfaiciighejbiahiihii","caecdaaihahejaidgcecejgcdfhhdeghjacgeaefhjbijbbhgh","hhfdeajjijgeechaieehfcfjaaaadjbejibjfajijcfhicbjhb"};
        List<String> strings = Solution.commonChars(words);
        for (String items: strings
        ) {
            System.out.print(items + " ");
        }
        System.out.println();
    }

    static class Solution {
        public static List<String> commonChars(String[] words) {
            List<String> result1 = new ArrayList<>();
            String orginal = words[0];
            char[] orginals = orginal.toCharArray();
            for (int i = 0; i < orginals.length; i++) {
                boolean flag = false;
                for (int j = 0; j < words.length; j++) {
                    if (!words[j].contains(orginals[i] + ""))
                        flag = true;
                }
                if (!flag)
                    result1.add(orginals[i] + "");
            }
            for (int j = 0; j < words.length; j++) {
                Iterator<String> iter = result1.iterator();
                while(iter.hasNext()) {
                    String next = iter.next();
                    Integer i1 = words[j].indexOf(next);
                    if(i1.compareTo(-1) != 0){
                        words[j] = words[j].replaceFirst(next, "!");
                    }else{
                        iter.remove();
                    }
                }
            }
            return result1;
        }
    }
}
