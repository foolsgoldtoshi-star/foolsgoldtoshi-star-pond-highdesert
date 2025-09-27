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
            # Core Clojure/Babashka toolchain
            pkgs.babashka 
            pkgs.clojure 
            pkgs.jdk17
            pkgs.zprint 
            pkgs.clj-kondo 
            
            # Node.js runtime (required for npm fallbacks)
            pkgs.nodejs_20 
            
            # Nix-available Node.js packages (prefer these over npm)
            pkgs.nodePackages.svelte-check
            pkgs.nodePackages.svelte-language-server
            pkgs.nodePackages.eslint
            pkgs.nodePackages.prettier
            pkgs.nodePackages.typescript
            pkgs.nodePackages.typescript-language-server
          ];
        };
      });
}
