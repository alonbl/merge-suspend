Build
=====

This plugin is built with Buck.

Two build modes are supported: Standalone and in Gerrit tree. Standalone
build mode is recommended, as this mode doesn't require local Gerrit
tree to exist.

Build standalone
----------------

Clone bucklets library:

```
  git clone https://gerrit.googlesource.com/bucklets

```
and link it to merge-suspend-plugin directory:

```
  cd merge-suspend-plugin && ln -s ../bucklets .
```

Add link to the .buckversion file:

```
  cd merge-suspend-plugin && ln -s bucklets/buckversion .buckversion
```

To build the plugin, issue the following command:

```
  buck build plugin
```

The output is created in

```
  buck-out/gen/merge-suspend-plugin/merge-suspend-plugin.jar
```

To execute the tests run:

```
  buck test
```
