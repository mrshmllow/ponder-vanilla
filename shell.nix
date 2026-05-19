let
  sources = import ./npins;
  pkgs = import sources.nixpkgs { };
in
pkgs.mkShell {
  packages = [
    pkgs.npins
    pkgs.zenity
    pkgs.openjdk
    # pkgs.glfw
    # pkgs.libglvnd
    # pkgs.libx11
    # pkgs.libxrandr
    # pkgs.libxcursor
    # pkgs.libxi
  ];

  LD_LIBRARY_PATH = pkgs.lib.makeLibraryPath [
    pkgs.libglvnd
    pkgs.libx11
    pkgs.flite
    # pkgs.libxrandr
    # pkgs.libxcursor
    # pkgs.libxi
  ];
}
