{
  description = "Pond Highdesert reproducible dev shell";
  inputs = { nixpkgs.url = "github:NixOS/nixpkgs/nixos-24.11"; };
  outputs = { self, nixpkgs }:
    let forAll = nixpkgs.lib.genAttrs [ "x86_64-linux" "aarch64-darwin" "x86_64-darwin" ];
    in forAll (system:
      let pkgs = import nixpkgs { inherit system; };
      in {
        devShells.default = pkgs.mkShell {
          buildInputs = [ 
            pkgs.babashka 
            pkgs.clojure 
            pkgs.nodejs_20 
            pkgs.zprint 
            pkgs.clj-kondo 
            pkgs.jdk17 
          ];
        };
      });
}
