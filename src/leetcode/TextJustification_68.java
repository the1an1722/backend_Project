package leetcode;

import java.util.List;
import java.util.ArrayList;

public class TextJustification_68 {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        List<String> line = new ArrayList<>();
        int lineLength = 0;

        for (String word : words) {
            if (line.isEmpty() || lineLength + line.size() + word.length() <= maxWidth) {
                line.add(word);
                lineLength += word.length();
            } else {
                int extraSpaces = maxWidth - lineLength;
                int spaceSlots = line.size() - 1;

                StringBuilder lineBuilder = new StringBuilder();

                if (spaceSlots == 0) {
                    // Special case: only one word in the line
                    lineBuilder.append(line.get(0));
                    lineBuilder.append(" ".repeat(extraSpaces));
                } else {
                    int spacesPerSlot = extraSpaces / spaceSlots;
                    int extraSpacesLeft = extraSpaces % spaceSlots;

                    for (int i = 0; i < line.size(); i++) {
                        lineBuilder.append(line.get(i));

                        if (i < spaceSlots) {
                            int spacesToAdd = spacesPerSlot + (i < extraSpacesLeft ? 1 : 0);
                            lineBuilder.append(" ".repeat(spacesToAdd));
                        }
                    }
                }

                result.add(lineBuilder.toString());
                line.clear();
                lineLength = 0;
                line.add(word);
                lineLength += word.length();
            }
        }

        // Process the last line (left-justified)
        StringBuilder lastLineBuilder = new StringBuilder();
        lastLineBuilder.append(String.join(" ", line));
        lastLineBuilder.append(" ".repeat(maxWidth - lastLineBuilder.length()));
        result.add(lastLineBuilder.toString());

        return result;
    }
}
