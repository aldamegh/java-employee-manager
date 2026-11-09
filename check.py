from pathlib import Path
import subprocess
import tempfile
ROOT = Path(__file__).resolve().parent
with tempfile.TemporaryDirectory(prefix="coursework-check-") as build:
    sources = sorted((ROOT/"src").glob("*.java")) + sorted((ROOT/"tests").glob("*.java"))
    subprocess.run(["javac", "--release", "8", "-proc:none", "-encoding", "UTF-8", "-d", build, *map(str, sources)], check=True, timeout=30)
    subprocess.run(["java", "-cp", build, "EmployeeTest"], check=True, timeout=15)
    result = subprocess.run(["java", "-cp", build, "Company"], input='1\n1 Alex 2 500 IT\n5\nIT\n6\n', text=True, capture_output=True, check=True, timeout=15)
    assert 'highest salary in IT' in result.stdout, result.stdout
    print("Company: synthetic console interaction passed.")
