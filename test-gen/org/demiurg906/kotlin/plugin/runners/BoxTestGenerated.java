

package org.demiurg906.kotlin.plugin.runners;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.demiurg906.kotlin.plugin.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("testData/box")
@TestDataPath("$PROJECT_ROOT")
public class BoxTestGenerated extends AbstractBoxTest {
  @Test
  public void testAllFilesPresentInBox() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("testData/box"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
  }

  @Test
  @TestMetadata("anotherBoxTest.kt")
  public void testAnotherBoxTest() {
    runTest("testData/box/anotherBoxTest.kt");
  }

  @Test
  @TestMetadata("simple.kt")
  public void testSimple() {
    runTest("testData/box/simple.kt");
  }
}
