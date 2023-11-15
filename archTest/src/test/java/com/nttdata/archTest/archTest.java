package com.nttdata.archTest;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;

class archTest {

	private final JavaClasses Paquete = new ClassFileImporter().importPackages("com.nttdata.archTest");
	
	//Nombres de Clases
		@Test
	    public void DebeContenerConstants() {

			ArchRule rule = classes().that()
	        	    .resideInAPackage("com.nttdata.archTest.Prueba")
	        	    .should().haveSimpleNameContaining("Any");
	        
	        rule.check(Paquete);
	    }

}
