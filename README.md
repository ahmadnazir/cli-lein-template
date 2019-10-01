[![Clojars Project](https://img.shields.io/clojars/v/cli/lein-template.svg)](https://clojars.org/cli/lein-template)

# cli

A Leiningen template for clojure applications that can be executed natively from the cli.

## Usage

[Optional] If you want to install from source:

```
lein install
```

Create a new app:

```
lein new cli app
```

### Build Native Executable

The bare bones app created for you prints hello world. Once built, a binary is
created on the project root directory. It runs in ~5 ms as compared to ~850 ms
when using the JVM.


```
cd app
bash build.sh                                      # Create a native executable
time ./app                                         # Run it!
                                                   # and get blazing fast run times :)
```

Output:

```
Hello world!
./app  0.00s user 0.00s system 76% cpu 0.004 total
```

## License

Copyright © 2019 Ahmad Nazir Raja

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
