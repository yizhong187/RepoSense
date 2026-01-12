package reposense.parser.types;

import java.nio.file.Path;
import java.nio.file.Paths;

import net.sourceforge.argparse4j.inf.Argument;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.ArgumentType;

/**
 * Checks the argument of {@code --assets} flag.
 */
public class AssetsFolderArgumentType implements ArgumentType<Path> {

    @Override
    public Path convert(ArgumentParser parser, Argument arg, String value) throws ArgumentParserException {
        // Simply convert the string to a Path without validating existence
        // This allows users to provide paths that may not exist yet
        return Paths.get(value);
    }
}
