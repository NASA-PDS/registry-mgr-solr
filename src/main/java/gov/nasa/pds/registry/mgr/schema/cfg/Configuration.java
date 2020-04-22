package gov.nasa.pds.registry.mgr.schema.cfg;

import java.io.File;
import java.util.List;
import java.util.Set;

public class Configuration
{
    // List of JSON data dictionary files
    public List<File> ddFiles;
    
    public Set<String> includeClasses;
    public Set<String> excludeClasses;
}
