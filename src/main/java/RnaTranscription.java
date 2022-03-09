import java.lang.StringBuilder;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder rnaStrand = new StringBuilder();
        for (int i=0; i < dnaStrand.length(); i++) {
        	char complement = ' ';
        	char nucleotide = dnaStrand.charAt(i);
        	if(nucleotide == 'G') {
        		complement = 'C';
        	}else if(nucleotide == 'C') {
        		complement = 'G';
        	}else if(nucleotide == 'T') {
        		complement = 'A';
        	}else if(nucleotide == 'A') {
        		complement = 'U';
        	}
        	rnaStrand.append(complement);
        }
        return rnaStrand.toString();
    }

}
