let
  sources = import ./npins;
  pkgs = import sources.nixpkgs { };
in
pkgs.mkShell {
  packages = [
    pkgs.npins
    pkgs.zenity
  ];

  LD_LIBRARY_PATH = pkgs.lib.makeLibraryPath [
    pkgs.libglvnd
    pkgs.libx11
    pkgs.flite
  ];
}
