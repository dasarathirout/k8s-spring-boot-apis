###########################################################################################
##  Create a password-protected, 2048-bit RSA private key file name (dasarathi.domain.key)
###########################################################################################
winpty openssl genrsa -des3 -out dasarathi.domain.key 2048
###########################################################################################
## Create a CSR (dasarathi.domain.csr) from our existing private key:
###########################################################################################
winpty openssl req -key dasarathi.domain.key -new -out dasarathi.domain.csr
