# gradle-mcp919

Decompiled MCP 919, refactored and setup with Gradle.

## Creation

1. Download and extract [MCP 918](http://www.modcoderpack.com/).
2. Download and extract [MCP 1.8.9 SRGs](https://github.com/ModCoderPack/MCPMappingsArchive/raw/refs/heads/master/mcp/1.8.9/mcp-1.8.9-srg.zip) to `~/conf`.
3. Decompile by running `decompile`.

    > Windows: `./decompile.bat`  
    > Linux: `./decompile.sh`

4. (Optional) Correct errors.

    ```java
    i.e.:
    // net.minecraft.world.gen.structure.StructureMineshaftPieces
    for (lvt_5_1_ = 0; k < this.boundingBox.getXSize(); k = k + 4)
    for (k = 0; k < this.boundingBox.getXSize(); k = k + 4)
    ```

5. Cleanup the workspace.

    > Relocated .jars to `~/libs`  
    > Copied natives (`~/run/versions/1.8.8/1.8.8-natives`) to `natives`

6. Create the gradle script.

## Usage

1. Download and extract the source.
2. Import the project into your IDE.
3. Done!

## Copyright

LICENSE.txt - MCP license.
```
MCP - Mod Coder Pack
MCP is (c) Copyright by the MCP Team

License and terms of use.

No warranties. If MCP does not work for you, or causes any damage, it's your problem. Use it at own risk.

You are allowed to:
- Use MCP to decompile the Minecraft client and server jar files.
- Use the decompiled source code to create mods for Minecraft.
- Recompile modified versions of Minecraft.
- Reobfuscate the classes of your mod for Minecraft.

You are NOT allowed to:
- Use MCP to do anything that violated Mojangs terms of use for Minecraft.
- Release Minecraft versions or modifications that allow you to play without having bought Minecraft from Mojang.
- Release modified or unmodified versions of MCP anywhere.
- Use any of MCPs scripts, tools or data files without explicit written permission.
- Make money with anything based on MCP (excluding Minecraft mods created by using MCP).
- Use MCP to create clients that are used for griefing or exploiting server bugs.
- Release the decompiled source code of Minecraft in any way.
```
