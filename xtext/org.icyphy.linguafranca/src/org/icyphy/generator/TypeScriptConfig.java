package org.icyphy.generator;

import java.io.IOException;
import java.nio.file.Path;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.icyphy.CodeGenConfig;

public class TypeScriptConfig extends CodeGenConfig {

    public TypeScriptConfig(Resource resource, IFileSystemAccess2 fsa,
            IGeneratorContext context) throws IOException {
        super(resource, fsa, context);
        this.srcGenPath = this.srcGenPath.resolve("src");
    }

}