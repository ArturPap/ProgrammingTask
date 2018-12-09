/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Artur
 */

public class DataTest {
  /*     private FileWriter fileWriter = new FileWriter();

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsErrorWhenTargetFileExists() throws IOException {
        // arrange
        File output = temporaryFolder.newFile("country.csv");

        thrown.expect(IOException.class);
        thrown.expectMessage("file already exists");

        // act
        fileWriter.writeTo(output.getPath(), "test");
    }

    @Test
    public void writesContentToFile() throws IOException {
        // arrange
        File output = temporaryFolder.newFolder("reports")
                .toPath()
                .resolve("country.csv")
                .toFile();

        // act
        fileWriter.writeTo(output.getPath(), "test");

        // assert
        assertThat(output)
                .hasContent("test")
                .hasExtension("csv")
                .hasParent(resolvePath("reports"));
    }

    private String resolvePath(String folder) {
        return temporaryFolder
                .getRoot().toPath()
                .resolve(folder)
                .toString();
    } */
}
